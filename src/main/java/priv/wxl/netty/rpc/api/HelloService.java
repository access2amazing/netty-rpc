package priv.wxl.netty.rpc.api;

/**
 * @author xueli.wang
 * @since 2020/11/15 14:28
 */

public interface HelloService {
    /**
     * 服务可用探测
     * @param name 服务明
     * @return 服务可用性
     */
    String hello(String name);
}
