package com.rhomobile.rhodes.extmanager;

public interface IRhoExtension {

    void onSetPropertiesData(IRhoExtManager extManager, String propId, String data, int pos, int total, IRhoExtData ext);
    void onSetPropertiesDataEnd(IRhoExtManager extManager, IRhoExtData ext);
    void onSetProperty(IRhoExtManager extManager, String name, String value, IRhoExtData ext);
    void onBeforeNavigate(IRhoExtManager extManager, String url, IRhoExtData ext);
    void onNavigateProgress(IRhoExtManager extManager, String url, int pos, int total, IRhoExtData ext);
    void onNavigateComplete(IRhoExtManager extManager, String url, IRhoExtData ext);
    void onDocumentComplete(IRhoExtManager extManager, String urlOfDocument, IRhoExtData ext);
    //bool onWndMsg(MSG& oMsg){return false;}
    //long onNavigateTimeout(IRhoExtManager extManager, String urlBeingNavigatedTo, IRhoExtData ext);
    //long onSIPState(IRhoExtManager extManager, boolean bSIPState, IRhoExtData ext);
    void onAlert(IRhoExtManager extManager, String message, IRhoExtData ext);
    void onConfirm(IRhoExtManager extManager, String message, IRhoExtData ext);
    void onSelect(IRhoExtManager extManager, String[] items, int selected, IRhoExtData ext);
    void onStatus(IRhoExtManager extManager, String status, IRhoExtData ext);
    void onTitle(IRhoExtManager extManager, String title, IRhoExtData ext);
    void onConsole(IRhoExtManager extManager, String message, IRhoExtData ext);
    void onInputMethod(IRhoExtManager extManager, boolean enabled, IRhoExtData ext);
    void onNavigateError(IRhoExtManager extManager, String url, IRhoExtData ext);

    void onAppActivate(IRhoExtManager extManager, boolean bActivate);

}

