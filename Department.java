package prob2;

public abstract class Department {
	private StringQueue queue = new StringQueue();
	public StringQueue getQueue() {
		return queue;
	}


	public void addMessage(String msg) {
		queue.enqueue(msg);
	}

	public String nextMessage() {
		String msg="";
		try {
			msg = queue.dequeue();
		} catch (EmptyQueueException e) {

			//e.printStackTrace();
			msg=null;

		}

		return msg;
	}

	public abstract String getName();
	//implement
}
