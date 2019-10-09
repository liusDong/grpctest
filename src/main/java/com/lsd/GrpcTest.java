package com.lsd;

import com.lsd.grpc.KeyPress;
import com.lsd.grpc.gRPCGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

/**
 * @program:grpctest
 * @Author:liushengdong
 * @Description:
 * @Date:Created in 2019-10-09 13:53
 * @Modified By:
 */
public class GrpcTest
{
    private final ManagedChannel channel;
    private final gRPCGrpc.gRPCBlockingStub blockingStub;
    public GrpcTest(String host,int port){
        channel = ManagedChannelBuilder.forAddress(host,port)
                .usePlaintext(true)
                .build();
        blockingStub = gRPCGrpc.newBlockingStub(channel);
    }
    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    public void greet(int code){
        KeyPress.KeyRequest request =  KeyPress.KeyRequest.newBuilder()
                .setCode(code)
                .build();
        KeyPress.KeyReply response = blockingStub.keyPress(request);
        System.out.println(response.getRes());
    }
    public static void main(String[] args) throws InterruptedException {
        GrpcTest client = new GrpcTest("localhost", 9097);
        for(int i=0;i<5;i++){
            client.greet(68);
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
