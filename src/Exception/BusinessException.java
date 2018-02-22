package Exception;

/**
 * @Description:自定义的异常
 * @author zsj
 * @date 2017年10月27日 下午3:44:22
 */
public class BusinessException extends Exception {
	private static final long serialVersionUID = 3866411531163489234L;
	String code;

	public BusinessException() {
		super();
	}

	public BusinessException(String code) {
		super(code);
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
