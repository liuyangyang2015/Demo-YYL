package com.demo.thread.lock;

/**
 * @author jack.l
 * @date 2021/12/24 3:55 下午
 * Description
 */
public     class     Person     {



                            private     String     name;

                            private     int     age;



                            public     Person(String     personName,     int     personAge)     {

                                                name     =     personName;

                                                age     =     personAge;

                            }



                            public     Person(Person     p)     {

                                                this(p.getName(),     p.getAge());

                            }



                            public     String     getName()     {

                                                return     name;

                            }



                            public     int     getAge()     {

                                                return     age;

                            }

        }



class     Employee     {



                            private     Person     person;



                            //     makes     a     defensive     copy     to     protect     against     modifications     by     caller

                            public     Person     getPerson()     {

                                                return     new     Person(person);

                            }





                            public     void     printEmployeeDetail(Employee     emp)     {

                                                Person     person     =     emp.getPerson();

                                                //     this     caller     does     not     modify     the     object,     so     defensive     copy     was     unnecessary

                                                System.out.println("Employee's     name:     "     +     person.getName()     +     ";     age:     "     +     person.getAge());

                            }

        }

