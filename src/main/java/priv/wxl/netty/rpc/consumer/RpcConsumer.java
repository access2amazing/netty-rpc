package priv.wxl.netty.rpc.consumer;

import priv.wxl.netty.rpc.api.HelloService;
import priv.wxl.netty.rpc.api.RpcService;
import priv.wxl.netty.rpc.consumer.proxy.RpcProxy;

/**
 * @author xueli.wang
 * @since 2020/11/15 18:51
 */

public class RpcConsumer {
    public static void main(String[] args) {
        HelloService helloService = RpcProxy.create(HelloService.class);

        System.out.println(helloService.hello("remote process call"));

        RpcService rpcService = RpcProxy.create(RpcService.class);

        System.out.println(rpcService.add(8, 2));
        System.out.println(rpcService.sub(8, 2));
        System.out.println(rpcService.mul(8, 2));
        System.out.println(rpcService.div(8, 2));
    }
}
