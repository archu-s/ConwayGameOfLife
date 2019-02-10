package com.archana.conway;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Archana Singh
 * Conway Game of Life
 *
 */
public class ConwayGameOfLife {
	
	/**
	 * Returns next generation grid.
	 * @param grid
	 * @return nextGenGrid
	 */
	public static int[][] getNextGenerationGrid(int[][] grid){
		int row_count = grid.length;
		
		int col_count = 0;
		if(row_count > 0) {
			col_count = grid[row_count-1].length;
		}
		
		int[][] nextGenGrid = new int[row_count][col_count];
		
		for(int r=0; r<row_count; r++) {
			for(int c=0;c<col_count; c++) {
				int count = getActiveNeighboursCount(grid, r, c);
				nextGenGrid[r][c] = getNextGenCellValue(grid[r][c], count);
			}
		}	
		
		return nextGenGrid;
	}
	/**
	 * Return if cellVal is active or not.
	 * @param cellVal
	 * @return
	 */
	public static boolean isActiveCell(int cellVal) {
		return cellVal==1?true:false;
	}
	
	/**
	 * Returns Next generation value based on negbCount.
	 * If cellVal is active and negbCount is 2 or 3 then it returns 1
	 * Else if cellVal is not active and negbCount is 3 then it returns 1
	 * Else it returns 0.
	 * @param cellVal
	 * @param negbCount
	 * @return
	 */
	public static int getNextGenCellValue(int cellVal, int negbCount) {
		if(isActiveCell(cellVal) && (negbCount == 2 || negbCount == 3)) {
			return 1;
		}
		if(!isActiveCell(cellVal) && negbCount == 3) {
			return 1;
		}
		return 0;
	}
	
	/**
	 * Returns total number of active neighbours
	 * @param grid
	 * @param row_index
	 * @param col_index
	 * @return
	 */
	public static int getActiveNeighboursCount(int[][] grid, int row_index, int col_index) {
		
		int count = 0;
		int row_count = grid.length;
		
		int col_count = 0;
		if(row_count > 0) {
			col_count = grid[row_count-1].length;
		}
		
		for(int r=row_index-1; r<=row_index+1;r++) {
			//if the cell is corner cell in that case r-1 or r+1 does not exist.
			if(r<0||r>=row_count) {
				continue;
			}
			for(int c=col_index-1;c<=col_index+1;c++) {
				//if the cell is corner cell in that case c-1 or c+1 does not exist.
				// and do not check for cell itself value.
				if(c<0 || c>=col_count || (r==row_index && c==col_index)) {
					continue;
				}
				count += grid[r][c];
			}
		}
		
		return count;
	}
	
	/**
	 * Returns random initial grid with provided row and col.
	 * @param row
	 * @param col
	 * @return
	 */
	public static int[][] createInitialGrid(int row, int col){
		int[][] grid = new int[row][col];
		Random r = new Random();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				grid[i][j] = r.nextInt(2);
			}
		}
		return grid;
		
	}
	
	/**
	 * Print grid with border
	 * @param grid
	 */
	public static void displayGrid(int[][] grid) {
        String border = String.format("+%0" + 2*(grid[0].length) + "d+", 0).replace("0","-");
        
        System.out.println(border);
        
        for (int[] row : grid) {
            String r = "|";
            for (int c : row) {
                r += c==1 ? "1 " : "  ";
            }
            r += "|";
            System.out.println(r);
        }
        
        System.out.println(border);
    }

	/**
	 * System in row column in first line e.g 4 5
	 * System in generation count in second line e.g 5
	 * @param args
	 * It system out teach generation output with border.
	 */
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			String matrix_indexes = sc.nextLine(); 
			int row = Integer.parseInt(matrix_indexes.split(" ")[0]);
			int col = Integer.parseInt(matrix_indexes.split(" ")[1]);
			int generationCount = Integer.parseInt(sc.nextLine()); 
			
			int[][] grid = ConwayGameOfLife.createInitialGrid(row, col);
			displayGrid(grid);
			for(int i=1;i<=generationCount;i++) {
				int[][] nextGenGrid = ConwayGameOfLife.getNextGenerationGrid(grid);
				grid = nextGenGrid;
				displayGrid(nextGenGrid);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
