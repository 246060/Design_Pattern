package retry.case1;

import retry.case1.exception.BusinessException;

@FunctionalInterface
public interface BusinessOperation<T> {

	T perform() throws BusinessException;
}
