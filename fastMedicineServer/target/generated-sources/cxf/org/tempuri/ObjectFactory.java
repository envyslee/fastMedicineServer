
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResponseData_QNAME = new QName("http://tempuri.org/", "ResponseData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IsBlackResponse }
     * 
     */
    public IsBlackResponse createIsBlackResponse() {
        return new IsBlackResponse();
    }

    /**
     * Create an instance of {@link ResponseData }
     * 
     */
    public ResponseData createResponseData() {
        return new ResponseData();
    }

    /**
     * Create an instance of {@link TestDownResponse }
     * 
     */
    public TestDownResponse createTestDownResponse() {
        return new TestDownResponse();
    }

    /**
     * Create an instance of {@link TestResponse }
     * 
     */
    public TestResponse createTestResponse() {
        return new TestResponse();
    }

    /**
     * Create an instance of {@link IsSureWithdrawCashResponse }
     * 
     */
    public IsSureWithdrawCashResponse createIsSureWithdrawCashResponse() {
        return new IsSureWithdrawCashResponse();
    }

    /**
     * Create an instance of {@link GetBusinessRepayInfoResponse }
     * 
     */
    public GetBusinessRepayInfoResponse createGetBusinessRepayInfoResponse() {
        return new GetBusinessRepayInfoResponse();
    }

    /**
     * Create an instance of {@link PostLoanPendingResponse }
     * 
     */
    public PostLoanPendingResponse createPostLoanPendingResponse() {
        return new PostLoanPendingResponse();
    }

    /**
     * Create an instance of {@link GetBusinessBillInfoResponse }
     * 
     */
    public GetBusinessBillInfoResponse createGetBusinessBillInfoResponse() {
        return new GetBusinessBillInfoResponse();
    }

    /**
     * Create an instance of {@link Test }
     * 
     */
    public Test createTest() {
        return new Test();
    }

    /**
     * Create an instance of {@link ChangeLoanPeriodSimBill }
     * 
     */
    public ChangeLoanPeriodSimBill createChangeLoanPeriodSimBill() {
        return new ChangeLoanPeriodSimBill();
    }

    /**
     * Create an instance of {@link GetBusinessAdvInfo }
     * 
     */
    public GetBusinessAdvInfo createGetBusinessAdvInfo() {
        return new GetBusinessAdvInfo();
    }

    /**
     * Create an instance of {@link IsSureWithdrawCash }
     * 
     */
    public IsSureWithdrawCash createIsSureWithdrawCash() {
        return new IsSureWithdrawCash();
    }

    /**
     * Create an instance of {@link ChangeBusinessToByStages }
     * 
     */
    public ChangeBusinessToByStages createChangeBusinessToByStages() {
        return new ChangeBusinessToByStages();
    }

    /**
     * Create an instance of {@link ChangeLoanPeriodSimBillResponse }
     * 
     */
    public ChangeLoanPeriodSimBillResponse createChangeLoanPeriodSimBillResponse() {
        return new ChangeLoanPeriodSimBillResponse();
    }

    /**
     * Create an instance of {@link GetBusinessAdvInfoResponse }
     * 
     */
    public GetBusinessAdvInfoResponse createGetBusinessAdvInfoResponse() {
        return new GetBusinessAdvInfoResponse();
    }

    /**
     * Create an instance of {@link PostLoanPending }
     * 
     */
    public PostLoanPending createPostLoanPending() {
        return new PostLoanPending();
    }

    /**
     * Create an instance of {@link DoBusinessClearLoanResponse }
     * 
     */
    public DoBusinessClearLoanResponse createDoBusinessClearLoanResponse() {
        return new DoBusinessClearLoanResponse();
    }

    /**
     * Create an instance of {@link GetBusinessRepayInfo }
     * 
     */
    public GetBusinessRepayInfo createGetBusinessRepayInfo() {
        return new GetBusinessRepayInfo();
    }

    /**
     * Create an instance of {@link TestDown }
     * 
     */
    public TestDown createTestDown() {
        return new TestDown();
    }

    /**
     * Create an instance of {@link ChangeBusinessToByStagesResponse }
     * 
     */
    public ChangeBusinessToByStagesResponse createChangeBusinessToByStagesResponse() {
        return new ChangeBusinessToByStagesResponse();
    }

    /**
     * Create an instance of {@link GetBusinessAdvForSinglePeriod }
     * 
     */
    public GetBusinessAdvForSinglePeriod createGetBusinessAdvForSinglePeriod() {
        return new GetBusinessAdvForSinglePeriod();
    }

    /**
     * Create an instance of {@link GetBusinessAdvForSinglePeriodResponse }
     * 
     */
    public GetBusinessAdvForSinglePeriodResponse createGetBusinessAdvForSinglePeriodResponse() {
        return new GetBusinessAdvForSinglePeriodResponse();
    }

    /**
     * Create an instance of {@link DoBusinessClearLoan }
     * 
     */
    public DoBusinessClearLoan createDoBusinessClearLoan() {
        return new DoBusinessClearLoan();
    }

    /**
     * Create an instance of {@link IsBlack }
     * 
     */
    public IsBlack createIsBlack() {
        return new IsBlack();
    }

    /**
     * Create an instance of {@link XXQDInsertVBS }
     * 
     */
    public XXQDInsertVBS createXXQDInsertVBS() {
        return new XXQDInsertVBS();
    }

    /**
     * Create an instance of {@link GetBusinessBillInfo }
     * 
     */
    public GetBusinessBillInfo createGetBusinessBillInfo() {
        return new GetBusinessBillInfo();
    }

    /**
     * Create an instance of {@link XXQDInsertVBSResponse }
     * 
     */
    public XXQDInsertVBSResponse createXXQDInsertVBSResponse() {
        return new XXQDInsertVBSResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ResponseData")
    public JAXBElement<ResponseData> createResponseData(ResponseData value) {
        return new JAXBElement<ResponseData>(_ResponseData_QNAME, ResponseData.class, null, value);
    }

}
