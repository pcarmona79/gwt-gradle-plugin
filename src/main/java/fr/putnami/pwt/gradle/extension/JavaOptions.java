package fr.putnami.pwt.gradle.extension;

import com.google.common.collect.Lists;

import java.util.Arrays;
import java.util.List;

public class JavaOptions {

	private List<String> javaArgs = Lists.newArrayList();

	private String maxHeapSize;
	private String minHeapSize;
	private String maxPermSize;
	private boolean debug = false;
	private int debugPort = 8000;
	private boolean debugSuspend = false;

	public List<String> getJavaArgs() {
		return javaArgs;
	}

	public void javaArgs(String... javaArgs) {
		this.javaArgs.addAll(Arrays.asList(javaArgs));
	}

	public String getMaxHeapSize() {
		return maxHeapSize;
	}

	public void maxHeapSize(String maxHeapSize) {
		this.maxHeapSize = maxHeapSize;
	}

	public String getMinHeapSize() {
		return minHeapSize;
	}

	public void minHeapSize(String minHeapSize) {
		this.minHeapSize = minHeapSize;
	}

	public String getMaxPermSize() {
		return maxPermSize;
	}

	public void setMaxPermSize(String maxPermSize) {
		this.maxPermSize = maxPermSize;
	}

	public boolean isDebug() {
		return debug;
	}

	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	public int getDebugPort() {
		return debugPort;
	}

	public void debugPort(int debugPort) {
		this.debugPort = debugPort;
	}

	public boolean isDebugSuspend() {
		return debugSuspend;
	}

	public void debugSuspend(boolean debugSuspend) {
		this.debugSuspend = debugSuspend;
	}


}
