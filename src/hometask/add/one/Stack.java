package hometask.add.one;

import java.util.Arrays;

public class Stack {
	private int capacity = 4;
	private Object[] stack = new Object[capacity];
	private int size = 0;

	public Stack() {
		super();
	}

	public Stack(int capacity, Object[] stack, int size) {
		super();
		this.capacity = capacity;
		this.stack = stack;
		this.size = size;
	}

	public void push(Object object) {
		if (size > (capacity - 1)) {
			stack = sizeIncrease(stack);
			capacity = stack.length;
		}
		stack[size] = object;
		size++;
	}

	public Object[] sizeIncrease(Object[] stack) {
		Object[] newStack = Arrays.copyOf(stack, (stack.length * 3) / 2 + 1);
		return newStack;
	}

	public Object pop() {
		if (stack[0] != null) {
			Object temp = stack[size - 1];
			stack[size - 1] = null;
			size--;
			return temp;
		}
		return null;
	}

	public Object peek() {
		if (stack[0] != null) {
			return stack[size-1];
		}
		return null;
	}

	@Override
	public String toString() {
		return "Stack [capacity=" + capacity + ", stack=" + Arrays.toString(stack) + ", size=" + size + "]";
	}

}
