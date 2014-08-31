package br.com.damiaomotos.test;

import org.junit.Test;

import br.com.damiaomotos.util.HibernateUtil;

public class GerarTabelasTeste {
	@Test
	public void gerar() {
		HibernateUtil.getSessionFactory();
		HibernateUtil.getSessionFactory().close();
	}
}
