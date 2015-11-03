package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest
{
	private static final int QUALITY = 40;
	private static final int SELLIN = 20;

	@Test
	public void decrementSellinAndQualityEveryday()
	{
		Item item = new Item("Item1", SELLIN, QUALITY);
		for (int i = 1; i < 100; i++) {
			GildedRose.updateItem(item);
			assertEquals(item.getSellIn(), SELLIN - i);
			assertEquals(item.getQuality(), QUALITY - i);
		}
	}
	
}