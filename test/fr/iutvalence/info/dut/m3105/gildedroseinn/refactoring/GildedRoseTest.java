package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GildedRoseTest {

	private static final int DEFAULT_QUALITY = 30;
	private static final int DEFAULT_SELLIN = 20;
	private static final int NEGATIVE_SELLIN = -1;

	private void assertThatItemQualityAndSellinAreUpdatedAsExpected(Item item, int decrementSellinBy,
			int decrementQualityBy) {
		int sellinBeforeUpdate = item.getSellIn();
		int qualityBeforeUpdate = item.getQuality();
		GildedRose.updateItem(item);
		assertEquals(item.getSellIn(), sellinBeforeUpdate - decrementSellinBy);
		assertEquals(item.getQuality(), qualityBeforeUpdate - decrementQualityBy);
	}

	@Test
	public void decrementSellinAndQualityEveryday() {
		Item item = new Item("Item", DEFAULT_SELLIN, DEFAULT_QUALITY);
		assertThatItemQualityAndSellinAreUpdatedAsExpected(item, 1, 1);
	}

	@Test
	public void ifSellinIsNegativeSellinShouldBeDecrementedByOneAndQualityByTwo() {
		Item item = new Item("Item", NEGATIVE_SELLIN, DEFAULT_QUALITY);
		assertThatItemQualityAndSellinAreUpdatedAsExpected(item, 1, 2);
	}

}