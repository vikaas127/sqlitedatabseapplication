package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Mensuration2 extends Activity {
    PDFView  pdfView;
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdm);
        PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewm);
        pdfView.fromAsset("mensurationthree.pdf").load();
    }}