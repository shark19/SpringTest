package com.chist.prospring.ch03;

public interface ArtworkSender {

    void sendArtwork(String artworkPath, Recipient recipient);
    String getFriendlyName();
    String getShortName();
}
