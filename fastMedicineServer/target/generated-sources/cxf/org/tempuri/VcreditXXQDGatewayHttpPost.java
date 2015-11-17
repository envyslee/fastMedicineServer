package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.0
 * 2015-11-16T08:54:43.727+08:00
 * Generated source version: 3.0.0
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "VcreditXXQDGatewayHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface VcreditXXQDGatewayHttpPost {

    /**
     * 未决结果确定后，进行调用
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "PostLoanPending")
    public ResponseData postLoanPending(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * 未分期订单更新成分期
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "ChangeBusinessToByStages")
    public ResponseData changeBusinessToByStages(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * 是否是黑名单用户
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "IsBlack")
    public ResponseData isBlack(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * Test
     */
    @WebMethod(operationName = "Test")
    public void test(
        @WebParam(partName = "bid", name = "bid", targetNamespace = "http://tempuri.org/")
        java.lang.String bid
    );

    /**
     * 查询一期提前清贷时订单情况
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetBusinessAdvForSinglePeriod")
    public ResponseData getBusinessAdvForSinglePeriod(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * 将星星钱袋信息插入到VBS中
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "XXQDInsertVBS")
    public ResponseData xxqdInsertVBS(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * 处理提前清贷
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "DoBusinessClearLoan")
    public ResponseData doBusinessClearLoan(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * 查询订单账单情况
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetBusinessBillInfo")
    public ResponseData getBusinessBillInfo(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * 查询提前清贷时订单情况
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetBusinessAdvInfo")
    public ResponseData getBusinessAdvInfo(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * 订单还款情况
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "GetBusinessRepayInfo")
    public ResponseData getBusinessRepayInfo(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * TestDown
     */
    @WebMethod(operationName = "TestDown")
    public void testDown(
        @WebParam(partName = "bid", name = "bid", targetNamespace = "http://tempuri.org/")
        java.lang.String bid,
        @WebParam(partName = "filetype", name = "filetype", targetNamespace = "http://tempuri.org/")
        java.lang.String filetype
    );

    /**
     * 模拟分期账单信息
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "ChangeLoanPeriodSimBill")
    public ResponseData changeLoanPeriodSimBill(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );

    /**
     * 是否可以提现
     */
    @WebResult(name = "ResponseData", targetNamespace = "http://tempuri.org/", partName = "Body")
    @WebMethod(operationName = "IsSureWithdrawCash")
    public ResponseData isSureWithdrawCash(
        @WebParam(partName = "json", name = "json", targetNamespace = "http://tempuri.org/")
        java.lang.String json
    );
}
