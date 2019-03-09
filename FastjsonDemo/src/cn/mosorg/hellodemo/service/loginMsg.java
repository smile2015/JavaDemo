package cn.mosorg.hellodemo.service;
/***
 * 说明：登录时所需要的相关信息
 * 作者：smile
 * 时间：2019年3月09日 17:26:18
 */
import java.io.Serializable;
//登录所需要的字段信息
public class loginMsg implements Serializable {
  private String avatarPath;
  private String accountNum;
  private String littleName;
  private String memberRank;
  private int growths;
  private String memberIntegral;
  public String getAvatarPath() {
    return avatarPath;
  }
  public void setAvatarPath(String avatarPath) {
    this.avatarPath = avatarPath;
  }
  public String getAccountNum() {
    return accountNum;
  }
  public void setAccountNum(String accountNum) {
    this.accountNum = accountNum;
  }
  public String getLittleName() {
    return littleName;
  }
  public void setLittleName(String littleName) {
    this.littleName = littleName;
  }
  public String getMemberRank() {
    return memberRank;
  }
  public void setMemberRank(String memberRank) {
    this.memberRank = memberRank;
  }
  public int getGrowths() {
    return growths;
  }
  public void setGrowths(int growths) {
    this.growths = growths;
  }
  public String getMemberIntegral() {
    return memberIntegral;
  }
  public void setMemberIntegral(String memberIntegral) {
    this.memberIntegral = memberIntegral;
  }
  /***
	@Override
	public String toString() {
		StringBuilder result=new StringBuilder();
		result.append("[{");
		result.append("\"avatarPath\":\""+getAvatarPath()+"\",");
		result.append("\"accountNum\":\""+getAccountNum()+"\",");
		result.append("\"littleName\":\""+getLittleName()+"\",");
		result.append("\"memberRank\":\""+getMemberRank()+"\",");
		result.append("\"memberIntegral\":\""+getMemberIntegral()+"\",");
		result.append("\"growths\":"+getGrowths()+",");
		result.append("\"memberIntegral\":\""+getMemberIntegral()+"\"");
		result.append("}]");
		
		return result.toString();
	}
	***/
  
  
}