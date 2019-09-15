package com.company;
class proxy  implements Actor{
     Actor actor;
     public proxy (Actor actor){
               this.actor=actor;
           }
     @Override
     public void Sing(int money) {
                 if (money>20){
                       actor.Sing( money);
                  }
                else{
                        System.out.println("钱不够");
                   }
           }

            @Override
    public void show(int money) {
                 if (money>20){
                          actor.show(money);
                      }
                   else{
                           System.out.println("钱不够");
                   }
            }

        }