class BigException extends Exception {
    protected String msg;

    public BigException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

}