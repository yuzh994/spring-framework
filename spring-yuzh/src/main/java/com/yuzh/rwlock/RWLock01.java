package com.yuzh.rwlock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLock01 {

	public static final Logger log = LoggerFactory.getLogger(RWLock01.class);

	static ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
	static Lock r = rwl.readLock();
	static Lock w = rwl.writeLock();

	public static void main(String[] args) {
		new Thread(()->{
			w.lock();
			try {
				log.info("w 读锁加锁成功");
			}finally {
				w.unlock();
			}
		},"t1").start();
	}
}
