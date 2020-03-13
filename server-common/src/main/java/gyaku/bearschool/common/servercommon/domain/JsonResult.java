package gyaku.bearschool.common.servercommon.domain;

public class JsonResult<T> {

    /**
     * 菜单接口返回值
     */
    private int errorCode;

    /**
     * 信息
     */
    private String message;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 数据
     */
    private T data;

    public JsonResult() {}

    public JsonResult(T data, int errorCode, String message, boolean success) {
        this.errorCode = errorCode;
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
