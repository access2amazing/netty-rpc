package priv.wxl.netty.rpc.provider;

import priv.wxl.netty.rpc.api.HelloService;

/**
 * @author xueli.wang
 * @since 2020/11/15 14:44
 */

public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name + "!";
    }
}
