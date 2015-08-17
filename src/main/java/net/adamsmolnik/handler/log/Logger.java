package net.adamsmolnik.handler.log;

import java.lang.management.ManagementFactory;
import java.util.Date;

import com.amazonaws.services.lambda.runtime.Context;

public class Logger {

	private final String processId = ManagementFactory.getRuntimeMXBean().getName();

	private final Context context;

	public Logger(Context context) {
		this.context = context;
	}

	public void log(String message) {
		doLog("[" + getBaseMessage(message) + "]");
	}

	public void log(Date then, String message) {
		doLog("[duration since then: " + (new Date().getTime() - then.getTime()) + ", " + getBaseMessage(message) + "]");
	}

	private String getBaseMessage(String message) {
		return "processId: " + processId + ", thread: " + Thread.currentThread() + ", " + context.getAwsRequestId() + ", date: " + new Date()
				+ ", message: " + message;
	}

	private void doLog(String message) {
		context.getLogger().log(message);
	}

}
