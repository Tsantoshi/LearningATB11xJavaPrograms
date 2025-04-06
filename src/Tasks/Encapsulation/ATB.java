package Tasks.Encapsulation;

  class ATB1 {
        private String name;
        private int id;

        public ATB1(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
           if(id>0) {
               this.id = id;
           }else {
               System.out.println("id can not be 0 or negative");
           }
        }
      public String toString() {
          return "Name: " + name + ", ID: " + id;
      }

    }


