package com.example.rita_pc.demonavigation;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class GradeOfStudent extends Fragment {

    EditText mEdtFirst, mEdtSecond, mEdtThird, mEdtFour, mEdtFive, mEdtSix,mEdtGrade;
    Button mBtnGrade;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v=inflater.inflate(R.layout.activity_grade_of_student,container,false);

        mEdtFirst = (EditText) v.findViewById(R.id.edtFirst);
        mEdtSecond = (EditText) v.findViewById(R.id.edtSecond);
        mEdtThird = (EditText) v.findViewById(R.id.edtThird);
        mEdtFour = (EditText) v.findViewById(R.id.edtFour);
        mEdtFive = (EditText) v.findViewById(R.id.edtFive);
        mEdtSix = (EditText) v.findViewById(R.id.edtSix);
        mEdtGrade = (EditText) v.findViewById(R.id.edtGrade);
        mBtnGrade = (Button) v.findViewById(R.id.btnGrade);

        mBtnGrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int s1, s2, s3, s4, s5, s6, total, grade;
                s1 = Integer.parseInt(mEdtFirst.getText().toString());
                s2 = Integer.parseInt(mEdtSecond.getText().toString());
                s3 = Integer.parseInt(mEdtThird.getText().toString());
                s4 = Integer.parseInt(mEdtFour.getText().toString());
                s5 = Integer.parseInt(mEdtFive.getText().toString());
                s6 = Integer.parseInt(mEdtSix.getText().toString());

                total = (s1 + s2 + s3 + s4 + s5 + s6);

								/*avg=total/6;
								System.out.println("Average is:"+avg);
								*/
                grade = (total * 100) / 600;
                if (s1 >= 35)
                {
                    if (s2 >= 35) {
                        if (s3 >= 35) {
                            if (s4 >= 35) {
                                if (s5 >= 35) {
                                    if (s6 >= 35) {
                                        if (grade >= 75) {
                                            mEdtGrade.setText("Distinction");
                                        } else if (grade >= 60) {
                                            mEdtGrade.setText("First Class");
                                        } else if (grade >= 50) {
                                            mEdtGrade.setText("Second Class");
                                        } else if (grade >= 35) {
                                            mEdtGrade.setText("Pass Class");
                                        } else if (grade < 35) {
                                            mEdtGrade.setText("Fail!!!");
                                        }

                                    } else if (grade >= 75) {
                                        mEdtGrade.setText("Distinction");
                                    } else if (grade >= 60) {
                                        mEdtGrade.setText("First Class");
                                    } else if (grade >= 50) {
                                        mEdtGrade.setText("Second Class");
                                    } else if (grade >= 35) {
                                        mEdtGrade.setText("Pass Class");
                                    } else if (grade < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    }

                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("ATKT");
                                    } else {
                                        if (grade >= 75) {
                                            mEdtGrade.setText("Distinction");
                                        } else if (grade >= 60) {
                                            mEdtGrade.setText("First Class");
                                        } else if (grade >= 50) {
                                            mEdtGrade.setText("Second Class");
                                        } else if (grade >= 35) {
                                            mEdtGrade.setText("Pass Class");
                                        } else if (grade < 35) {
                                            mEdtGrade.setText("Fail!!!");
                                        }
                                    }
                                }
                            } else {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("ATKT");

                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("ATKT");
                                    } else {
                                        if (grade >= 75) {
                                            mEdtGrade.setText("Distinction");
                                        } else if (grade >= 60) {
                                            mEdtGrade.setText("First Class");
                                        } else if (grade >= 50) {
                                            mEdtGrade.setText("Second Class");
                                        } else if (grade >= 35) {
                                            mEdtGrade.setText("Pass Class");
                                        } else if (grade < 35) {
                                            mEdtGrade.setText("Fail!!!");
                                        }
                                    }

                                }
                            }
                        } else {
                            if (s4 < 35) {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("ATKT");
                                    }
                                }
                            } else {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("ATKT");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("ATKT");
                                    } else {
                                        if (grade >= 75) {
                                            mEdtGrade.setText("Distinction");
                                        } else if (grade >= 60) {
                                            mEdtGrade.setText("First Class");
                                        } else if (grade >= 50) {
                                            mEdtGrade.setText("Second Class");
                                        } else if (grade >= 35) {
                                            mEdtGrade.setText("Pass Class");
                                        } else if (grade < 35) {
                                            mEdtGrade.setText("Fail!!!");
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        if (s3 < 35) {
                            if (s4 < 35) {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                }
                            } else {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("ATKT");
                                    }
                                }
                            }
                        } else {
                            if (s4 < 35) {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("ATKT");
                                    }
                                }
                            } else {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("ATKT");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("ATKT");
                                    } else {
                                        if (grade >= 75) {
                                            mEdtGrade.setText("Distinction");
                                        } else if (grade >= 60) {
                                            mEdtGrade.setText("First Class");
                                        } else if (grade >= 50) {
                                            mEdtGrade.setText("Second Class");
                                        } else if (grade >= 35) {
                                            mEdtGrade.setText("Pass Class");
                                        } else if (grade < 35) {
                                            mEdtGrade.setText("Fail!!!");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else
                {
                    if (s2 < 35)
                    {
                        if (s3 < 35)
                        {
                            if (s4 < 35) {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                }
                            } else {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                }
                            }
                        }
                        else {
                            if (s4 < 35)
                            {
                                if (s5 < 35)
                                {
                                    if (s6 < 35)
                                    {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                    else
                                    {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                }
                            } else {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("ATKT");
                                    }
                                }
                            }
                        }

                    } else
                    {
                        if (s3 < 35)
                        {
                            if (s4 < 35)
                            {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                }
                            } else
                            {
                                if (s5 < 35)
                                {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                }
                                else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                    else
                                    {
                                        mEdtGrade.setText("ATKT");
                                    }
                                }
                            }
                        } else {
                            if (s4 < 35) {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("Fail!!!");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("ATKT");
                                    }
                                }
                            } else {
                                if (s5 < 35) {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("Fail!!!");
                                    } else {
                                        mEdtGrade.setText("ATKT");
                                    }
                                } else {
                                    if (s6 < 35) {
                                        mEdtGrade.setText("ATKT");
                                    } else {
                                        if (grade >= 75) {
                                            mEdtGrade.setText("Distinction");
                                        } else if (grade >= 60) {
                                            mEdtGrade.setText("First Class");
                                        } else if (grade >= 50) {
                                            mEdtGrade.setText("Second Class");
                                        } else if (grade >= 35) {
                                            mEdtGrade.setText("Pass Class");
                                        } else if (grade < 35) {
                                            mEdtGrade.setText("Fail!!!");
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }


        });

        return v;
    }
}
