package Java.basics;

public class AlphapetsPattern {

	public static void main(String[] args) {
		AlphapetsPattern name = new AlphapetsPattern();
		name.P();
		System.out.println();
		name.R();
		System.out.println();
		name.A();
		System.out.println();
		name.S();
		System.out.println();
		name.A();
		System.out.println();
		name.N();
		System.out.println();
		name.T();
		System.out.println();
		name.H();
	}

	private void P() {
		// TODO Auto-generated method stub
		int row, col;

		for (row = 1; row <= 10; row++) {
			if (row == 1 || row == 5) {
				for (col = 1; col <= 7 - 1; col++) {
					System.out.print("* ");
				}
			} else {
				if (row <= 5) {
					for (col = 1; col <= 7; col++) {

						if (col == 1 || col == 7) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					}

				} else {
					for (col = 1; col <= 7; col++) {

						if (col == 1) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					}

				}

			}

			System.out.println();

		}
	}

	private void R() {
		// TODO Auto-generated method stub
		int row, col;

		for (row = 1; row <= 10; row++) {
			if (row == 1 || row == 5) {
				for (col = 1; col <= 7 - 1; col++) {
					System.out.print("* ");
				}
			} else {
				if (row <= 5) {
					for (col = 1; col <= 7; col++) {

						if (col == 1 || col == 7) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					}

				} else {
					for (col = 1; col <= 7; col++) {

						if (col == 1 || col == 7) {
							System.out.print("* ");
						} else {
							System.out.print("  ");
						}
					}

				}

			}

			System.out.println();

		}
	}

	private void A() {
		// TODO Auto-generated method

		int row, col;

		for (row = 1; row <= 10; row++) {
			if (row == 1 || row == 5) {

				for (col = 1; col <= 7; col++) {
					if (row == 1) {
						if (col == 1 || col == 7) {
							System.out.print("  ");
						} else {
							System.out.print("* ");
						}
					} else {
						System.out.print("* ");
					}

				}
			} else {
				for (col = 1; col <= 7; col++) {
					if (col == 1 || col == 7) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();

		}

	}

	private void S() {
		// TODO Auto-generated method stub

		int col, row;

		for (row = 1; row <= 10; row++) {

			for (col = 1; col <= 7; col++) {
				if (row == 1 || row == 5 || row == 10) {
					if (col == 1) {

						System.out.print("  ");
					} else {
						System.out.print("* ");
					}
				} else if (row <= 5) {
					if (col == 1)
						System.out.print("* ");

				} else {
					if (row >= 5 && row <= 10) {
						if (col == 7) {
							System.out.print("  *");
						} else {
							System.out.print("  ");
						}
					}
				}

			}

			System.out.println();

		}

	}

	private void N() {
		// TODO Auto-generated method stub
		int row, col;

		for (row = 1; row <= 10; row++) {
			for (col = 1; col <= 7; col++) {
				if (col == 1 || col == row || col == 7 && row <= 7) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

	private void T() {
		// TODO Auto-generated method stub
		int row, col;

		for (row = 1; row <= 10; row++) {
			for (col = 1; col <= 7; col++) {
				if (row == 1) {
					System.out.print("* ");
				} else if (row >= 1) {
					if (col == 4) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}

				}

			}
			System.out.println();
		}
	}

	private void H() {
		// TODO Auto-generated method stub
		int row, col;

		for (row = 1; row <= 10; row++) {
			for (col = 1; col <= 7; col++) {
				if (row == 5) {
					System.out.print("* ");
				} else if (row >= 1) {
					if (col == 1 || col == 7) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}

				}

			}
			System.out.println();
		}
	}

}
