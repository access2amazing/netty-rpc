package priv.wxl.netty.rpc.protocol;

import lombok.Data;

import java.io.Serializable;

/**
 * @author xueli.wang
 * @since 2020/11/15 14:31
 */

@Data
public class InvokerProtocol implements Serializable {
    private String className;

    private String methodName;

    private Class<?>[] params;

    private Object[] values;
}
