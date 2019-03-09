package cn.mosorg.hellodemo;

import java.util.List;

import com.alibaba.fastjson.JSON;

import cn.mosorg.hellodemo.service.loginMsg;


public class gdsfds {

	public static void main(String[] args) {
		String lmsg="[{\"avatarPath\":\"/vaf/ddd\",\"accountNum\":\"u1333\",\"littleName\":\"fdsa\",\"memberRank\":\"fdsa\",\"memberIntegral\":\"fdsafd\",\"growths\":2,\"memberIntegral\":\"gdsafds\"}]";
		
		
		List<loginMsg> loginMsgInfo=JSON.parseArray(lmsg, loginMsg.class);

		String AccountNum=loginMsgInfo.get(0).getAccountNum();
		
		System.out.println(AccountNum);
	}

}
