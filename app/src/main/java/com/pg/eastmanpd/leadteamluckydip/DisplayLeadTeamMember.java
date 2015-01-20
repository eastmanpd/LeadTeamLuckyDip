package com.pg.eastmanpd.leadteamluckydip;

import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class DisplayLeadTeamMember extends Activity {

    private LeadTeam mLeadTeam = new LeadTeam();
    private Instruction mInstruction = new Instruction();
    private String mLeadTeamMember = ""; //TODO - follow up on initialization of variables
    private String mInstructionText = ""; //TODO - follow up on initialization of variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_lead_team_member);

        // Declare our View variables & assign them the Views from the layout file
        final TextView instructionText; //TODO - check why "final" declaration type
        instructionText = (TextView) findViewById(R.id.instructionTextView);
        final TextView leadTeamMemberText = (TextView) findViewById(R.id.leadTeamMemberTextView);
        final Button dipButton = (Button) findViewById(R.id.dipAgainButton);

        mLeadTeamMember = mLeadTeam.getLeadTeamMember();
        mInstructionText = mInstruction.getInstruction();
        instructionText.setText(mInstructionText);
        leadTeamMemberText.setText(mLeadTeamMember);

        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLeadTeamMember = mLeadTeam.getLeadTeamMember();
                mInstructionText = mInstruction.getInstruction();
                instructionText.setText(mInstructionText);
                leadTeamMemberText.setText(mLeadTeamMember);
                            }
        };

        dipButton.setOnClickListener(listener);
       }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_display_lead_team_member, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
