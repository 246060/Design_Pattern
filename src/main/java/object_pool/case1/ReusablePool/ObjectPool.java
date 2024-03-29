package object_pool.case1.ReusablePool;

import java.util.Enumeration;
import java.util.Hashtable;

abstract class ObjectPool<T> {

	private long deadTime;
	private Hashtable<T, Long> lock, unlock;

	public ObjectPool() {
		deadTime = 50000; // 50 seconds
		lock = new Hashtable<>();
		unlock = new Hashtable<>();
	}

	public abstract T create();
	public abstract boolean validate(T o);
	public abstract void dead(T o);

	public synchronized T takeOut() {
		long now = System.currentTimeMillis();
		T t;

		if (unlock.size() > 0) {
			Enumeration<T> e = unlock.keys();

			while (e.hasMoreElements()) {
				t = e.nextElement();

				if ((now - unlock.get(t)) > deadTime) {
					// object has dead
					unlock.remove(t);
					dead(t);
					t = null;

				} else {
					if (validate(t)) {
						unlock.remove(t);
						lock.put(t, now);
						return t;
					} else {
						// object failed validation
						unlock.remove(t);
						dead(t);
						t = null;
					}
				}
			}
		}

		// no objects available, create a new one
		t = create();
		lock.put(t, now);
		return t;
	}

	public synchronized void takeIn(T t) {
		lock.remove(t);
		unlock.put(t, System.currentTimeMillis());
	}
}


