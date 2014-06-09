package app.loveand.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import app.loveand.R;


public class RegActivity extends BaseActivity {

	private EditText mUserET;
	private EditText mPassET;
	private EditText mRepetitionET;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reg);
		initView();
	}
	@Override
	protected void initView() {
		mUserET = (EditText) findViewById(R.id.reg_username_et);
		mPassET = (EditText) findViewById(R.id.reg_pass_edittext);
		mRepetitionET = (EditText) findViewById(R.id.reg_repetition_pass_edittext);
		
	}
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.reg_hasuser_bt:
			startActivity(new Intent(this,LoginActivity.class));
			break;
		case R.id.reg_next_bt:
			startActivity(new Intent(this,Reg2Activity.class));
			break;
		case R.id.back_arraw:
			finish();
			break;
		default:
			break;
		}
	}
}
