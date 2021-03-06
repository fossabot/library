package com.mrq.library.FastScroll;

/**
 * create by Ibrahim Mrq
 * 10/June/2021
 * */

public interface SectionTitleProvider{

    /**
     * Should be implemented by the adapter of the RecyclerView.
     * Provides a text to be shown by the bubble, when RecyclerView reaches
     * the position. Usually the first letter of the text shown by the item
     * at this position.
     * @param position Position of the row in adapter
     * @return The text to be shown in the bubble
     */
    String getSectionTitle(int position);
}
