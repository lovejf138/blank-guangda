package com.jilepay.guangda.protocol.pay;

import com.jilepay.guangda.protocol.base.BaseResData;

public class QrCodePayOfAlipayResData extends BaseResData {

	// 以下字段在result_code = 0时有返回
	private String code_url;
	private String code_img_url;

	// 跟文档不匹配多出来的字段
	private String appid;

	@Override
	public String toString() {
		return "QrCodePayOfAlipayResData [version=" + version + ", charset=" + charset + ", sign_type=" + sign_type
				+ ", status=" + status + ", message=" + message + ", result_code=" + result_code + ", mch_id=" + mch_id
				+ ", device_info=" + device_info + ", nonce_str=" + nonce_str + ", err_code=" + err_code + ", err_msg="
				+ err_msg + ", sign=" + sign + ", code_url=" + code_url + ", code_img_url=" + code_img_url + ", appid="
				+ appid + "]";
	}

	public String getCode_url() {
		return code_url;
	}

	public void setCode_url(String code_url) {
		this.code_url = code_url;
	}

	public String getCode_img_url() {
		return code_img_url;
	}

	public void setCode_img_url(String code_img_url) {
		this.code_img_url = code_img_url;
	}

	public String getAppid() {
		return appid;
	}

	public void setAppid(String appid) {
		this.appid = appid;
	}
}
