
               ans.add(coin[i]);
               value -= coin[i];
            }
        }

        System.out.println("total (min coins used )="+ COuntofCoins);

        for(int i=0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }
        System.out.println();
