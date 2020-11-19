package priv.wxl.netty.rpc.api;

/**
 * @author xueli.wang
 * @since 2020/11/15 14:29
 */

public interface RpcService {
    int add(int a, int b);

    int sub(int a, int b);

    int mul(int a, int b);

    int div(int a, int b);
}
