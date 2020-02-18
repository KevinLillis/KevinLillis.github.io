/* FileIO.cpp */
# include<iostream>
# include<fstream>

using namespace std;

int main() {
	// Declare and Initialize all variables
	int numberAccounts{}; // Number of accounts in the file
	int accountNumber{};
	double balance{};
	int numberTransactions{}; // number of transactions for a single account
	const int CREDIT{ 0 };
	const int DEBIT{ 1 };
	double amount{}; // Transaction amount
	int transactionType{}; // will be CREDIT or DEBIT

	ifstream inFile{}; // Input file
	ofstream outFile{}; // output file

	// Open file
	inFile.open("input.txt");
	if (!inFile) {
		cerr << "ERROR! Cannot open input file input.txt" << endl;
		return EXIT_FAILURE;
	}
	outFile.open("output.txt");

	// Read number of accounts
	inFile >> numberAccounts;

	// Process each account
	for (int i{ 0 }; i < numberAccounts; i++) {
		// Read account number and initial balance
		inFile >> accountNumber;
		inFile >> balance;

		// Read the number of transactions against this account
		inFile >> numberTransactions;

		// Process each transaction for this account
		for (int j{ 0 }; j < numberTransactions; j++) {
			inFile >> transactionType;
			inFile >> amount;

			if (transactionType == CREDIT) {
				balance += amount;
			}
			else if (transactionType == DEBIT) {
				balance -= amount;
			}
			else {
				cerr << "ERROR! Invalid transaction type" << endl;
				cerr << "on account number " << accountNumber << endl;
				cerr << "Transaction ignored." << endl;
			}
		} // end process transaction

		// write the results of this account to the output file and the screen
		outFile << accountNumber << " " << balance << endl;
		cout << accountNumber << " " << balance << endl;

	} // finished processing all accounts

	// Close the files
	inFile.close();
	outFile.close();

	return EXIT_SUCCESS;
}