package com.kristiyan.fmi;

import java.util.Scanner;

public class Main {

    //in our case the hex is static but can be easily turned into random-one
    private static final String hex = "3557b8003245a1a926de0867d391387aef2b6c92881c43f9d50ca6f7b026913f68ab51ece434683428f420d75e0facea0d1d6019745e09cae29682889952f6c5390c913c75d9aa45dc3f8b05cdff18480233febcbb540bccfe106fdbd8f755424ab3857ad8d9f8b761b588f3647ac33f6fb6bbd52a560118e0f46e0febf7022cb6203ed8f0fc04ce8add600e71f94fca4993bee7ed778b47c832797f39e88656986cd06071390cc309b6c126542cc1dbdd332c16a012b85a12ea9a7760fd318e4ec5084f1d618c709a24ad48fbde40c4d1c0865e946bbd22e6c2fe974987a651e1dba66ff1e4fad3372d564e45af6581428389beb6e99e4c18cc29c758e93dffe34b32a2a3f57ae8c552e3b9baef2669b3654c2a786bc5ba74d0b9ee0b4bbbad929856eb67568eea441be851f5155be27ea687a65af6c12bc7a37c8e41329f618ffd1729f99dd3c057548288e0a26e94246b73d2a2f9e49f76c83fe37ec43b1adb1de2cc68a33f4c28bd0f16e672b986a8ac6516f2521462628f9551cb3ca5c30274db4367f29e75f965970455d6c41acd794b5d9e4eca64290d9099f9ab8e4589e52e3f54443c5110cef7a0a5ed92b7cdd8cea7347897949d0c7aea7d10d6be30a4d446c21c97453cdd8fd92bf36a834f9150b678d5031d53dd10e04a4f8416bd9e4dfae2090454bd97fd1861f29405d4857b891f5719967258d574c2d60d48";

    public static void main(String[] args) {

        String cleartext = new Scanner(System.in).nextLine();
        cleartext = HexUtil.asciiToHex(cleartext);


        String pad = hex.substring(0, cleartext.length());
        String cyphertext = HexUtil.xorHex(cleartext, pad);

        
        //check if we succeeded
        String result = HexUtil.hexToAscii(HexUtil.xorHex(cyphertext, pad));
        System.out.println(result);
    }
}