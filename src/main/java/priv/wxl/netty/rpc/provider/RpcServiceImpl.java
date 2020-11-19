package priv.wxl.netty.rpc.provider;

import priv.wxl.netty.rpc.api.RpcService;

/**
 * @author xueli.wang
 * @since 2020/11/15 14:45
 */

public class RpcServiceImpl implements RpcService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }

    @Override
    public int mul(int a, int b) {
        return a * b;
    }

    @Override
    public int div(int a, int b) {
        return a / b;
    }
}
