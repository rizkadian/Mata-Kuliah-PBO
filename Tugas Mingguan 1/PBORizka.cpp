#include<iostream>
using namespace std;
int main(){
	int pilih;
    string data1 = "Hallo";
    string data2 = "Selamat datang";
    string data3 = "Rizka Dianrani";
	cout<<"==============================="<<endl;
	cout<<"      PROGRAM JAVA DASAR       "<<endl;
	cout<<"==============================="<<endl;
	cout<<"1. Perulangan For "<<endl;
	cout<<"2. Perulangan Ehile "<<endl;
	cout<<"3. Perulangan Do While "<<endl;
	cout<<"4. Array 1 Dimensi "<<endl;
	cout<<"5. Array Multidimensi"<<endl<<endl;
	cout<<"Masukkan Pilihan Anda : ";
	cin>>pilih; 
	if(pilih==1){ 
		cout<<endl<<"Perulangan Menggunakan For"<<endl<<endl;
		for(int i=0 ; i<5; i++){ 
			cout<<data1<<endl;
		}
	}else if(pilih==2){
		cout<<endl<<"Perulangan Menggunakan While"<<endl<<endl;
		int i=1;
		while(i<=5){ 
			cout<<data2<<endl;
			i++;
		}
	}else if(pilih==3){
		cout<<endl<<"Perulangan Menggunakan Do While"<<endl<<endl;
		int i=1;
		do{ 
			cout<<data3<<endl;
			i++;
		}while(i<=5);
		cout<<data3<<endl;		
	}else if(pilih==4){
		cout<<endl<<"Array 1 Dimensi"<<endl<<endl;
		int array[10];
		for(int i=1; i<=5; i++){
			cout<<"Masukan data ke - "<<i<<" = ";
			cin>>array[i];
		}
		cout<<endl;
		for(int i=1; i<=5; i++){
			cout<<array[i]<<" ";
		}
		cout<<endl;
	}else if(pilih==5){
		cout<<endl<<"Array multidimensi"<<endl<<endl;
		int array[50][50];
		for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++) {
                cout<<"Masukan data ke - "<<i<<" = ";
                cin>>array[i][j];
            }
        cout<<endl;
    	}
        for(int i=1; i<=3; i++){
            for(int j=1; j<=3; j++) {
                cout<<array[i][j]<<" ";
            }
        cout<<endl;
        }
	}
	return 0;
}