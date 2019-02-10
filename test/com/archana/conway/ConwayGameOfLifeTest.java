package com.archana.conway;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Archana Singh
 * Test cases
 *
 */
public class ConwayGameOfLifeTest {
	
	@Test
	public void testNeighboursCountForLeftTopCornerCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		
		int count = ConwayGameOfLife.getActiveNeighboursCount(grid, 0, 0);
		Assertions.assertEquals(3, count);	
		
	}
	
	@Test
	public void testNeighboursCountForRightTopCornerCellTest() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		
		int count = ConwayGameOfLife.getActiveNeighboursCount(grid, 0, 3);
		Assertions.assertEquals(3, count);	
		
	}
	
	@Test
	public void testNeighboursCountForLeftBottomCornerCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		
		int count = ConwayGameOfLife.getActiveNeighboursCount(grid, 2, 0);
		Assertions.assertEquals(3, count);	
		
	}
	
	@Test
	public void testNeighboursCountForRightBottomCornerCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		
		int count = ConwayGameOfLife.getActiveNeighboursCount(grid, 2, 3);
		Assertions.assertEquals(3, count);	
		
	}
	
	@Test
	public void testNeighboursCountForNonCornerTopBorderCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		
		int count = ConwayGameOfLife.getActiveNeighboursCount(grid, 0, 1);
		Assertions.assertEquals(5, count);	
		
	}
	
	@Test
	public void testNeighboursCountForNonCornerBottomBorderCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		
		int count = ConwayGameOfLife.getActiveNeighboursCount(grid, 2, 1);
		Assertions.assertEquals(5, count);	
		
	}
	
	@Test
	public void testNeighboursCountForNonCornerLeftBorderCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		
		int count = ConwayGameOfLife.getActiveNeighboursCount(grid, 1, 0);
		Assertions.assertEquals(5, count);	
		
	}
	
	@Test
	public void testNeighboursCountForNonCornerRightBorderCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		
		int count = ConwayGameOfLife.getActiveNeighboursCount(grid, 1, 3);
		Assertions.assertEquals(5, count);	
		
	}
	
	@Test
	public void testNneighboursCountForAnyNonCornerNonBorderCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
		
		int count = ConwayGameOfLife.getActiveNeighboursCount(grid, 1, 1);
		Assertions.assertEquals(8, count);	
		
	}
	
	//Test Dead or Active for Active cell
	
	@Test
	public void testDeadOrActiveForLeftTopCornerActiveCellTwoNeigActiveCell() {
		int[][] grid = new int[][] {
			{1, 0, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(1, nextGenGrid[0][0]);	
			
	}
	
	
	@Test
	public void testDeadOrActiveForLeftTopCornerNonActiveCellTwoNeigActiveCell() {
		int[][] grid = new int[][] {
			{0, 0, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(0, nextGenGrid[0][0]);	
			
	}
		
	@Test
	public void testDeadOrActiveForLeftTopCornerActiveCellThreeNeigActiveCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(1, nextGenGrid[0][0]);	
			
	}
	
	
	@Test
	public void testDeadOrActiveForLeftTopCornerNonActiveCellThreeNeigActiveCell() {
		int[][] grid = new int[][] {
			{0, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(1, nextGenGrid[0][0]);	
			
	}
	
	@Test
	public void testDeadOrActiveForLeftTopCornerActiveCellZeroNeigActiveCell() {
		int[][] grid = new int[][] {
			{1, 0, 1, 1},
			{0, 0, 1, 1},
			{1, 1, 1, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(0, nextGenGrid[0][0]);	
			
	}
	
	
	@Test
	public void testDeadOrActiveForLeftTopCornerNonActiveCellZeroNeigActiveCell() {
		int[][] grid = new int[][] {
			{0, 0, 1, 1},
			{0, 0, 1, 1},
			{1, 1, 1, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(0, nextGenGrid[0][0]);	
			
	}
		
	@Test
	public void testDeadOrActiveForCornerNonBorderActiveCellZeroNeigActiveCell() {
		int[][] grid = new int[][] {
			{0, 0, 0, 1},
			{0, 1, 0, 1},
			{0, 0, 0, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(0, nextGenGrid[1][1]);		
			
	}
	
	
	@Test
	public void testDeadOrActiveForCornerNonBorderNonActiveCellZeroNeigActiveCell() {
		int[][] grid = new int[][] {
			{0, 0, 0, 1},
			{0, 0, 0, 1},
			{0, 0, 0, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(0, nextGenGrid[1][1]);		
			
	}
	
	@Test
	public void testDeadOrActiveForCornerNonBorderActiveCellTwoNeigActiveCell() {
		int[][] grid = new int[][] {
			{1, 0, 1, 1},
			{0, 1, 0, 1},
			{0, 0, 0, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(1, nextGenGrid[1][1]);		
			
	}
	
	
	@Test
	public void testDeadOrActiveForCornerNonBorderNonActiveCellTwoNeigActiveCell() {
		int[][] grid = new int[][] {
			{1, 0, 1, 1},
			{0, 0, 0, 1},
			{0, 0, 0, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(0, nextGenGrid[1][1]);		
			
	}	
	
	@Test
	public void testDeadOrActiveForCornerNonBorderNonActiveCellThreeNeigActiveCell() {
		int[][] grid = new int[][] {
			{1, 0, 1, 1},
			{0, 0, 0, 1},
			{0, 1, 0, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(1, nextGenGrid[1][1]);		
			
	}
	
	@Test
	public void testDeadOrActiveForCornerNonBorderActiveCellEgihtNeigActiveCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1},
			{1, 1, 1, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(0, nextGenGrid[1][1]);		
			
	}
	
	
	@Test
	public void testDeadOrActiveForCornerNonBorderNonActiveCellEgihtNeigActiveCell() {
		int[][] grid = new int[][] {
			{1, 1, 1, 1},
			{1, 0, 1, 1},
			{1, 1, 1, 1}
		};
			
		int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
		Assertions.assertEquals(0, nextGenGrid[1][1]);		
			
	}

}
