package py.dubbosupport.sample.provider.exception;

/**
 * Created by pengyu on 2015/5/28.
 */
public class SimpleException extends Exception {
	private static final long serialVersionUID = 1L;

	public SimpleException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SimpleException(int type) {
	}

	public SimpleException(String msg, int type) {
		super(msg);
	}
}
