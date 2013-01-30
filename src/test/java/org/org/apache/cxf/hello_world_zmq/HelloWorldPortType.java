package org.org.apache.cxf.hello_world_zmq;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 2.7.2
 * 2013-01-30T19:28:18.075+01:00
 * Generated source version: 2.7.2
 * 
 */
@WebService(targetNamespace = "http://cxf.apache.org/hello_world_zmq", name = "HelloWorldPortType", serviceName = "HelloWorldService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWorldPortType {

    @WebResult(name = "greeting", targetNamespace = "http://cxf.apache.org/hello_world_zmq", partName = "greeting")
    @WebMethod(action = "sayHello")
    public String sayHello(
            @WebParam(partName = "firstName", name = "firstName")
            String firstName
    );
}
