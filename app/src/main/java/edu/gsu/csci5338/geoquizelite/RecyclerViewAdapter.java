package edu.gsu.csci5338.geoquizelite;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mQuestions = new ArrayList<>();
//    private ArrayList<String> mTrueButton = new ArrayList<>();
//    private ArrayList<String> mFalseButton = new ArrayList<>();
//    private ArrayList<String> mCheatButton = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context context, ArrayList<String> questions) {
        this.mQuestions = questions;
//        this.mTrueButton = mTrueButton;
//        this.mFalseButton = mFalseButton;
//        this.mCheatButton = mCheatButton;
        this.mContext = context;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_quiz_list, viewGroup, false);
       ViewHolder holder = new ViewHolder(view);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int i) {

        holder.questionTextView.setText(mQuestions.get(i));
//        holder.trueButton.setText(mTrueButton.get(i));
//        holder.falseButton.setText(mFalseButton.get(i));
//        holder.cheatButton.setText(mCheatButton.get(i));


    }

    @Override
    public int getItemCount() {
        return mQuestions.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView questionTextView;
//        Button trueButton;
//        Button falseButton;
//        Button cheatButton;
        RelativeLayout parentLayout;

        public ViewHolder(View itemView){
            super(itemView);
            questionTextView = itemView.findViewById(R.id.question_text_view);
//            trueButton = itemView.findViewById(R.id.true_button);
//            falseButton = itemView.findViewById(R.id.false_button);
//            cheatButton = itemView.findViewById(R.id.cheat_button);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }

    }
}
