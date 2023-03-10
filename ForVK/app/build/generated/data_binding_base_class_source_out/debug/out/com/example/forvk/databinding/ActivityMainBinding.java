// Generated by view binder compiler. Do not edit!
package com.example.forvk.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.forvk.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton bCam;

  @NonNull
  public final ImageButton bChange;

  @NonNull
  public final ImageButton bContacts;

  @NonNull
  public final ImageButton bExit;

  @NonNull
  public final ImageButton bGreet;

  @NonNull
  public final ImageButton bMessanger;

  @NonNull
  public final ImageButton bMic;

  @NonNull
  public final LinearLayout body;

  @NonNull
  public final ConstraintLayout cHe;

  @NonNull
  public final ConstraintLayout cYou;

  @NonNull
  public final LinearLayout footer;

  @NonNull
  public final LinearLayout header;

  @NonNull
  public final ImageView iK;

  @NonNull
  public final ImageView iV;

  @NonNull
  public final TextView tHe;

  @NonNull
  public final TextView tYou;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull ImageButton bCam,
      @NonNull ImageButton bChange, @NonNull ImageButton bContacts, @NonNull ImageButton bExit,
      @NonNull ImageButton bGreet, @NonNull ImageButton bMessanger, @NonNull ImageButton bMic,
      @NonNull LinearLayout body, @NonNull ConstraintLayout cHe, @NonNull ConstraintLayout cYou,
      @NonNull LinearLayout footer, @NonNull LinearLayout header, @NonNull ImageView iK,
      @NonNull ImageView iV, @NonNull TextView tHe, @NonNull TextView tYou) {
    this.rootView = rootView;
    this.bCam = bCam;
    this.bChange = bChange;
    this.bContacts = bContacts;
    this.bExit = bExit;
    this.bGreet = bGreet;
    this.bMessanger = bMessanger;
    this.bMic = bMic;
    this.body = body;
    this.cHe = cHe;
    this.cYou = cYou;
    this.footer = footer;
    this.header = header;
    this.iK = iK;
    this.iV = iV;
    this.tHe = tHe;
    this.tYou = tYou;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bCam;
      ImageButton bCam = ViewBindings.findChildViewById(rootView, id);
      if (bCam == null) {
        break missingId;
      }

      id = R.id.bChange;
      ImageButton bChange = ViewBindings.findChildViewById(rootView, id);
      if (bChange == null) {
        break missingId;
      }

      id = R.id.bContacts;
      ImageButton bContacts = ViewBindings.findChildViewById(rootView, id);
      if (bContacts == null) {
        break missingId;
      }

      id = R.id.bExit;
      ImageButton bExit = ViewBindings.findChildViewById(rootView, id);
      if (bExit == null) {
        break missingId;
      }

      id = R.id.bGreet;
      ImageButton bGreet = ViewBindings.findChildViewById(rootView, id);
      if (bGreet == null) {
        break missingId;
      }

      id = R.id.bMessanger;
      ImageButton bMessanger = ViewBindings.findChildViewById(rootView, id);
      if (bMessanger == null) {
        break missingId;
      }

      id = R.id.bMic;
      ImageButton bMic = ViewBindings.findChildViewById(rootView, id);
      if (bMic == null) {
        break missingId;
      }

      id = R.id.body;
      LinearLayout body = ViewBindings.findChildViewById(rootView, id);
      if (body == null) {
        break missingId;
      }

      id = R.id.cHe;
      ConstraintLayout cHe = ViewBindings.findChildViewById(rootView, id);
      if (cHe == null) {
        break missingId;
      }

      id = R.id.cYou;
      ConstraintLayout cYou = ViewBindings.findChildViewById(rootView, id);
      if (cYou == null) {
        break missingId;
      }

      id = R.id.footer;
      LinearLayout footer = ViewBindings.findChildViewById(rootView, id);
      if (footer == null) {
        break missingId;
      }

      id = R.id.header;
      LinearLayout header = ViewBindings.findChildViewById(rootView, id);
      if (header == null) {
        break missingId;
      }

      id = R.id.iK;
      ImageView iK = ViewBindings.findChildViewById(rootView, id);
      if (iK == null) {
        break missingId;
      }

      id = R.id.iV;
      ImageView iV = ViewBindings.findChildViewById(rootView, id);
      if (iV == null) {
        break missingId;
      }

      id = R.id.tHe;
      TextView tHe = ViewBindings.findChildViewById(rootView, id);
      if (tHe == null) {
        break missingId;
      }

      id = R.id.tYou;
      TextView tYou = ViewBindings.findChildViewById(rootView, id);
      if (tYou == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, bCam, bChange, bContacts, bExit,
          bGreet, bMessanger, bMic, body, cHe, cYou, footer, header, iK, iV, tHe, tYou);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
