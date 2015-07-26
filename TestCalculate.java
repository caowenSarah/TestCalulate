package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestCalculate {
	Calculate cal;

	@Before
	public void setUp() throws Exception {
		//开始竟然漏掉了这句
		cal = new Calculate();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testadd() {
		int rel = cal.add(22, 11);
		Assert.assertEquals("加法有问题", rel, 39);
	}
	@Test
	public void testminus() {
		int rel = cal.minus(22, 11);
		Assert.assertEquals("减法有问题", rel, 39);
	}
	@Test
	public void testmul() {
		int rel = cal.mul(22, 11);
		Assert.assertEquals("乘法有问题", rel, 39);
	}
	@Test
	public void testdiv() {
		int rel = cal.div(22, 11);
		Assert.assertEquals("除法有问题", rel, 39);
	}

}
