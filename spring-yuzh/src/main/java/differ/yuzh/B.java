package differ.yuzh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yuzh
 * @date 2021/5/12 16:48
 */
@Component
public class B {
	@Autowired
	private A a;
}
