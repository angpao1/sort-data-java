public class Member {
    String vip;
    String receiveDateTime;
    String claimType;
    String orderNo;
    String insuredName;
    String policyNo;
    String remarkNo;
    String docType;
    String inputBranch;
    String saveID;
    String date;
    String time;

    public Member(String vip, String receiveDateTime, String claimType, String orderNo, String insuredName, String policyNo, String remarkNo, String docType, String inputBranch, String saveID, String date, String time) {
        this.vip = vip;
        this.receiveDateTime = receiveDateTime;
        this.claimType = claimType;
        this.orderNo = orderNo;
        this.insuredName = insuredName;
        this.policyNo = policyNo;
        this.remarkNo = remarkNo;
        this.docType = docType;
        this.inputBranch = inputBranch;
        this.saveID = saveID;
        this.date = date;
        this.time = time;
    }

    public String getVIP() {
        return vip;
    }

    public void setVIP(String vip) {
        this.vip = vip;
    }

    public String getReceiveDateTime() {
        return receiveDateTime;
    }

    public void setReceiveDateTime(String receiveDateTime) {
        this.receiveDateTime = receiveDateTime;
    }

    public String getClaimType() {
        return claimType;
    }

    public void setClaimType(String claimType) {
        this.claimType = claimType;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getRemarkNo() {
        return remarkNo;
    }

    public void setRemarkNo(String remarkNo) {
        this.remarkNo = remarkNo;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getInputBranch() {
        return inputBranch;
    }

    public void setInputBranch(String inputBranch) {
        this.inputBranch = inputBranch;
    }

    public String getSaveID() {
        return saveID;
    }

    public void setSaveID(String saveID) {
        this.saveID = saveID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Member{" +
                "vip='" + vip + '\'' +
//                ", receiveDateTime='" + receiveDateTime + '\'' +
//                ", claimType='" + claimType + '\'' +
//                ", orderNo='" + orderNo + '\'' +
                ", insuredName='" + insuredName + '\'' +
//                ", policyNo='" + policyNo + '\'' +
//                ", remarkNo='" + remarkNo + '\'' +
//                ", docType='" + docType + '\'' +
//                ", inputBranch='" + inputBranch + '\'' +
//                ", saveID='" + saveID + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
