/**
 * Project: com.dianping.lion.lion-console-0.0.1
 * 
 * File Created at 2012-7-9
 * $Id$
 * 
 * Copyright 2010 dianping.com.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Dianping Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with dianping.com.
 */
package com.dianping.lion.dao.ibatis;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dianping.lion.dao.OperationLogDao;
import com.dianping.lion.entity.OperationLog;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath*:config/spring/appcontext-*.xml"	
})
public class OpeationLogIbatisDaoTest {
	
	@Autowired
	private OperationLogDao operationLogDao;

	@Test
	public void testGetTeams() {
		List<OperationLog> opeationLogs = operationLogDao.getLogs();
		Assert.assertNotNull(opeationLogs);
	}

}