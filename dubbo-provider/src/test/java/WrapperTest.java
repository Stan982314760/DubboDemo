import com.alibaba.dubbo.common.bytecode.Wrapper;
import com.stan.service.HelloService;

import java.io.IOException;

/**
 * @Author: stan
 * @Date: 2022/03/25
 * @Description:
 */
public class WrapperTest {
    public static void main(String[] args) throws IOException {
        Wrapper wrapper = Wrapper.getWrapper(HelloService.class);
        System.out.println(wrapper);
        System.in.read();
    }
}
