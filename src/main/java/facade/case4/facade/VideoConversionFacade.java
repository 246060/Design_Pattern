package facade.case4.facade;

import facade.case4.subsystem.Codec;
import facade.case4.subsystem.MPEG4CompressionCodec;
import facade.case4.subsystem.OggCompressionCodec;
import facade.case4.subsystem.CodecFactory;
import facade.case4.subsystem.VideoFile;
import facade.case4.subsystem.*;

import java.io.File;

public class VideoConversionFacade {

	public File convertVideo(String fileName, String format) {
		System.out.println("VideoConversionFacade: conversion started.");

		VideoFile file = new VideoFile(fileName);
		Codec sourceCodec = CodecFactory.extract(file);

		Codec destinationCodec;
		if (format.equals("mp4")) {
			destinationCodec = new OggCompressionCodec();
		} else {
			destinationCodec = new MPEG4CompressionCodec();
		}

		VideoFile buffer = BitrateReader.read(file, sourceCodec);
		VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

		File result = (new AudioMixer()).fix(intermediateResult);

		System.out.println("VideoConversionFacade: conversion completed.");
		return result;
	}
}