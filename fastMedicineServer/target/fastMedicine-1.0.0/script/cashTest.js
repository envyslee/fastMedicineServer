//绑定银行卡
function bindcards()
{
	var app= $("#app").val();
	var cust_id = $("#cust_id").val();
	var card_type = parseInt($("#card_type").val());
	var sign_date = $("#sign_date").val();
	var card_holder = $("#card_holder").val();
	var card_no = $("#card_no").val();
	var card_bank = $("#card_bank").val();
	var card_bankname = $("#card_bankname").val();
	var req={"cust_id":cust_id,"card_type":card_type,"sign_date":sign_date,"card_holder":card_holder,
			 "card_no":card_no,"card_bank":card_bank,"card_bankname":card_bankname};
	req = $.toJSON(req);
	var dataArray={};
	dataArray["url"]="cash/bindcards";
	dataArray["req"]=req;
	postData(dataArray);
}

//解绑
function unbindcards(){
	var app= $("#app").val();
	var cust_id = $("#unbindcards_cust_id").val();
	var card_no = $("#unbindcards_card_no").val();
	var req={"cust_id":cust_id,"card_no":card_no};
	req = $.toJSON(req);
	var dataArray={};
	dataArray["url"]="cash/unbindcards";
	dataArray["req"]=req;
	postData(dataArray);
}

//查询额度
function credit(){
	var app= $("#app").val();
	var cust_id=$("#credit_cust_id").val();
	
	var req={"cust_id":cust_id};
	req=$.toJSON(req);
	var dataArray={};
	dataArray["url"]="cash/credit";
	dataArray["req"]=req;
	postData(dataArray);
}

//刷新额度
function creditrefresh(){
	var app= $("#app").val();
	var cust_id=$("#refresh_cust_id").val();
	var cust_surfingscore=$("#refresh_cust_surfingscore").val();
	var cust_accessnettime=parseInt($("#refresh_cust_accessnettime").val());
	var cust_consume_monthly=parseInt($("#refresh_cust_consume_monthly").val());
	var cust_credit_expiretime=$("#refresh_cust_credit_expiretime").val();
	var cust_isfamily=Boolean($("#refresh_cust_isfamily").val());
	
	var req={"cust_id":cust_id,"cust_surfingscore":cust_surfingscore,"cust_accessnettime":cust_accessnettime,
			"cust_consume_monthly":cust_consume_monthly,"cust_credit_expiretime":cust_credit_expiretime,"cust_isfamily":cust_isfamily};
	req=$.toJSON(req);
	var dataArray={};
	dataArray["url"]="cash/credit/refresh";
	dataArray["req"]=req;
	postData(dataArray);
}

//客户开通
function agree(){
	var cust_id=$("#agree_cust_id").val();
	var cust_idcard=$("#agree_cust_idcard").val();
	var cust_name=$("#agree_cust_name").val();
	var cust_mobile=$("#agree_cust_mobile").val();
	
	var sign_date=$("#agree_sign_date").val();
	var card_type=parseInt($("#agree_card_type").val());
	var card_holder=$("#agree_card_holder").val();
	var card_no=$("#agree_card_no").val();
	
	var card_bank=$("#agree_card_bank").val();
	var card_bankname=$("#agree_card_bankname").val();
	
	var cust_surfingscore=$("#agree_cust_surfingscore").val();
	var cust_accessnettime=parseInt($("#agree_cust_accessnettime").val());
	var cust_consume_monthly=parseInt($("#agree_cust_consume_monthly").val());
	var cust_credit_expiretime=$("#agree_cust_credit_expiretime").val();
	
	var cust_credit=parseInt($("#agree_cust_credit").val());
	var cust_isfamily=Boolean($("#agree_cust_isfamily").val());
	
	var req={"cust_id":cust_id,"cust_idcard":cust_idcard,"cust_name":cust_name,"cust_mobile":cust_mobile,
			"sign_date":sign_date,"card_type":card_type,"card_holder":card_holder,"card_no":card_no,
			"card_bank":card_bank,"card_bankname":card_bankname,
			"cust_surfingscore":cust_surfingscore,"cust_accessnettime":cust_accessnettime,
			"cust_consume_monthly":cust_consume_monthly,"cust_credit_expiretime":cust_credit_expiretime,
			"cust_isfamily":cust_isfamily,"cust_credit":cust_credit};
	req=$.toJSON(req);
	var dataArray={};
	dataArray["url"]="cash/agree";
	dataArray["req"]=req;
	postData(dataArray);
}
	//提现申请
	function apply(){
		var app= $("#app").val();
		var order_id=$("#apply_order_id").val();
		var cust_id=$("#apply_cust_id").val();
		var apply_time=$("#apply_apply_time").val();
		var apply_amount=parseInt($("#apply_apply_amount").val());
        var apply_period=parseInt($("#apply_apply_period").val());
        var repay_remind= Boolean($("#apply_repay_remind").val());
        var req={"order_id":order_id,"cust_id":cust_id,"apply_time":apply_time,"apply_amount":apply_amount,"apply_period":apply_period,"repay_remind":repay_remind};
    	req=$.toJSON(req);
    	var dataArray={};
    	dataArray["url"]="cash/lending";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//提现结果
	function feedback(){
		var app= $("#app").val();
		var order_id=$("#feedback_order_id").val();
		var cust_id=$("#feedback_cust_id").val();
		var loan_time=$("#feedback_loan_time").val();
		var surfing_rescode=$("#feedback_surfing_rescode").val();
		var surfing_resmsg=$("#feedback_surfing_resmsg").val();
		var req={"order_id":order_id,"cust_id":cust_id,"loan_time":loan_time,"surfing_rescode":surfing_rescode,"surfing_resmsg":surfing_resmsg};
    	req=$.toJSON(req);
    	var dataArray={};
    	dataArray["url"]="cash/lending/feedback";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//未结清订单
	function unclear(){
		var app= $("#app").val();
		var cust_id=$("#unclear_cust_id").val();
		var req={"cust_id":cust_id};
		req=$.toJSON(req);
		var dataArray={};
    	dataArray["url"]="cash/order/uncleared";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//查询订单还款计划
	function repayschedule(){
		var app= $("#app").val();
		var cust_id=$("#repayschedule_cust_id").val();
		var order_id=$("#repayschedule_order_id").val();
		var req={"order_id":order_id,"cust_id":cust_id};
		req=$.toJSON(req);
		var dataArray={};
    	dataArray["url"]="cash/order/repayschedule";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//查询所有订单
	function allbill(){
		var app= $("#app").val();
		var cust_id=$("#all_cust_id").val();
		var page_size=parseInt($("#all_page_size").val());
		var page_index=parseInt($("#all_page_index").val());
		var req={"cust_id":cust_id,"page_size":page_size,"page_index":page_index};
		req=$.toJSON(req);
		var dataArray={};
    	dataArray["url"]="cash/order/all";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//查询订单实际还款记录
	function repayrecord(){
		var app= $("#app").val();
		var cust_id=$("#repayrecord_cust_id").val();
		var order_id=$("#repayrecord_order_id").val();
		var req={"order_id":order_id,"cust_id":cust_id};
		req=$.toJSON(req);
		var dataArray={};
    	dataArray["url"]="cash/order/repayrecord";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//一期提前还款
	function period(){
		var app= $("#app").val();
		var cust_id=$("#period_cust_id").val();
		var order_id=$("#period_order_id").val();
		var req={"order_id":order_id,"cust_id":cust_id};
		req=$.toJSON(req);
		var dataArray={};
    	dataArray["url"]="cash/order/prerepayment/period";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//分期提前还款
	function periods(){
		var app= $("#app").val();
		var cust_id=$("#periods_cust_id").val();
		var order_id=$("#periods_order_id").val();
		var req={"order_id":order_id,"cust_id":cust_id};
		req=$.toJSON(req);
		var dataArray={};
    	dataArray["url"]="cash/order/prerepayment/periods";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//提前还款确认
	function submit(){
		var app= $("#app").val();
		var cust_id=$("#submit_cust_id").val();
		var order_id=$("#submit_order_id").val();
		var repayment_amount=parseInt($("#submit_repayment_amount").val());
		var surfing_deductkey=$("#submit_surfing_deductkey").val();
		var req_time=$("#submit_req_time").val();
		var req={"order_id":order_id,"cust_id":cust_id,"repayment_amount":repayment_amount,"surfing_deductkey":surfing_deductkey,"req_time":req_time};
		req=$.toJSON(req);
		var dataArray={};
    	dataArray["url"]="cash/order/prerepayment/submit";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//提前还款结果通知
	function prefeedback(){
		var app= $("#app").val();
		var cust_id=$("#pf_cust_id").val();
		var order_id=$("#pf_order_id").val();
		var repayment_amount=parseInt($("#pf_repayment_amount").val());
		var surfing_deductkey=$("#pf_surfing_deductkey").val();
		var actual_repayment_amount=parseInt($("#pf_actual_repayment_amount").val());
		var surfing_rescode=$("#pf_surfing_rescode").val();
		var deduct_date=$("#pf_deduct_date").val();
		var surfing_resmsg=$("#pf_surfing_resmsg").val();
		var vcredit_deductkey=$("#pf_vcredit_deductkey").val();
		var req={"order_id":order_id,"cust_id":cust_id,"repayment_amount":repayment_amount,
				"surfing_deductkey":surfing_deductkey,"deduct_date":deduct_date,
				"actual_repayment_amount":actual_repayment_amount,"surfing_rescode":surfing_rescode,
				"surfing_resmsg":surfing_resmsg,"vcredit_deductkey":vcredit_deductkey};
		req=$.toJSON(req);
		var dataArray={};
    	dataArray["url"]="cash/order/prepayment/feedback";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//代扣还款结果通知
	function deductfeedback(){
		var app= $("#app").val();
		var cust_id=$("#df_cust_id").val();
		var order_id=$("#df_order_id").val();
		var repayment_amount=parseInt($("#df_repayment_amount").val());
		var surfing_deductkey=$("#df_surfing_deductkey").val();
		var actual_repayment_amount=parseInt($("#df_actual_repayment_amount").val());
		var surfing_rescode=$("#df_surfing_rescode").val();
		var deduct_date=$("#df_deduct_date").val();
		var surfing_resmsg=$("#df_surfing_resmsg").val();
		var vcredit_deductkey=$("#df_vcredit_deductkey").val();
		var req={"order_id":order_id,"cust_id":cust_id,"repayment_amount":repayment_amount,
				"surfing_deductkey":surfing_deductkey,"deduct_date":deduct_date,
				"actual_repayment_amount":actual_repayment_amount,"surfing_rescode":surfing_rescode,
				"surfing_resmsg":surfing_resmsg,"vcredit_deductkey":vcredit_deductkey};
		req=$.toJSON(req);
		var dataArray={};
    	dataArray["url"]="cash/order/deduct/feedback";
    	dataArray["req"]=req;
    	postData(dataArray);
	}
	
	//代扣请求
	function orderdeduct(){
		var BusinessID=parseInt($("#od_BusinessID").val());
		var DeductAmt=$("#od_DeductAmt").val();
		var VbsDeductKey=$("#od_VbsDeductKey").val();
		var SendTime=$("#od_SendTime").val();
		var req={"BusinessID":BusinessID,"DeductAmt":DeductAmt,"VbsDeductKey":VbsDeductKey,"SendTime":SendTime};
		$.ajax({
			type : "POST",
			url: "vbs/order/deduct",
			dataType : "json",
			contentType:"application/json",
			data : JSON.stringify(req),
			success : function(data) {
				alert(data.rescode + ":" + data.resmsg);
			},
			complete : function(XMLHttpRequest, textStatus) {
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("请求出错");
			}
		});
 }
	   
	    
	//还款结果查询
	function orderrepayresult(){
		var BusinessID=parseInt($("#or_BusinessID").val());
		var SurfingDeductKey=$("#or_SurfingDeductKey").val();
		var VbsDeductKey=$("#or_VbsDeductKey").val();
		var SendTime=$("#or_SendTime").val();
		var req={"BusinessID":BusinessID,"SurfingDeductKey":SurfingDeductKey,"VbsDeductKey":VbsDeductKey,"SendTime":SendTime};
		$.ajax({
			type : "POST",
			url : "vbs/order/repayresult",
			dataType : "json",
			contentType:"application/json",
			data : JSON.stringify(req),
			success : function(data) {
				alert(data.rescode + ":" + data.resmsg);
			},
			complete : function(XMLHttpRequest, textStatus) {
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("请求出错");
			}
		});
	}
	
	function getUserList(){
		var pageIndex=parseInt($("#gu_pageIndex").val());
		var pageSize=parseInt($("#gu_pageSize").val());
		var name=$("#gu_name").val();
		var identityNo=$("#gu_identityNo").val();		
		var mobile=$("#gu_mobile").val();
		var orangeScoresBegin=$("#gu_orangeScoresBegin").val();
		var orangeScoresEnd=$("#gu_orangeScoresEnd").val();
		var creditMoneyBegin=$("#gu_creditMoneyBegin").val();
		var creditMoneyEnd=$("#gu_creditMoneyEnd").val();
		var creditTimeBegin=$("#gu_creditTimeBegin").val();
		var creditTimeEnd=$("#gu_creditTimeEnd").val();
		
		var req={"PageIndex":pageIndex,"PageSize":pageSize,"Name":name,"IdentityNo":identityNo,"Mobile":mobile,"OrangeScoresBegin":orangeScoresBegin,"OrangeScoresEnd":orangeScoresEnd
				,"CreditMoneyBegin":creditMoneyBegin,"CreditMoneyEnd":creditMoneyEnd,"CreditTimeBegin":creditTimeBegin,"CreditTimeEnd":creditTimeEnd};
		$.ajax({
			type : "POST",
			url : "vbs/GetUserList",
			dataType : "json",
			contentType:"application/json",
			data : JSON.stringify(req),
			success : function(data) {
				alert(data.rescode + ":" + data.resmsg);
			},
			complete : function(XMLHttpRequest, textStatus) {
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("请求出错");
			}
		});
	}

	
	function getuserdetails(){
		var userId=parseInt($("#gu_userId").val());
		var req={"UserId":userId};
		$.ajax({
			type : "POST",
			url : "vbs/GetUserDetails",
			dataType : "json",
			contentType:"application/json",
			data : JSON.stringify(req),
			success : function(data) {
				alert(data.rescode + ":" + data.resmsg);
			},
			complete : function(XMLHttpRequest, textStatus) {
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("请求出错");
			}
		});
	}
	
	function postData(dataArray){
		$.ajax({
			type : "POST",
			url : dataArray["url"],
			data : {
				app : "1",
				req:dataArray["req"]
			},
			datatype : "html",
			success : function(data) {
				alert(data);
			},
			complete : function(XMLHttpRequest, textStatus) {
			},
			error : function(XMLHttpRequest, textStatus, errorThrown) {
				alert("请求出错");
			}
		});
	}

	 $(document).ready(function(){
		 var d=new Date(),
		 str='';
		 var year=d.getFullYear();
		 var month=d.getMonth()+1;
		 month=month<10?"0"+month:month;
		 var day=d.getDate();
		 day=day<10?"0"+day:day;
		 var hour=d.getHours()<10?"0"+d.getHours():d.getHours();
		 var min=d.getMinutes()<10?"0"+d.getMinutes():d.getMinutes();
		 var sec=d.getSeconds()<10?"0"+d.getSeconds():d.getSeconds();
		 str=year+'-'+month+'-'+day+' '+hour+':'+min+':'+sec;
		 
		 $("#sign_date").val(str);
		 $("#apply_apply_time").val(str);
		 $("#feedback_loan_time").val(str);
		 $("#submit_req_time").val(str);
		 
		 $("#pf_deduct_date").val(str);
		 $("#df_deduct_date").val(str);
	 });
