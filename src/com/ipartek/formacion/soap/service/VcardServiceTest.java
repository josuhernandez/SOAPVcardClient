package com.ipartek.formacion.soap.service;

import static org.junit.Assert.assertEquals;

import java.rmi.RemoteException;

import org.junit.Test;

import com.ipartek.formacion.soap.Empleado;

public class VcardServiceTest {

	@Test
	public void test() throws RemoteException {

		VcardServiceProxy cliente = new VcardServiceProxy();

		Empleado e = cliente.getVcard("admin", "admin", 1);

		assertEquals("Ander", e.getNombre());

	}

}
